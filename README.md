# SimpleFX

**SimpleFX** is a modern, minimalistic UI-Library based on **JavaFX**,  
created for **GraalVM**, **JDK 25** and **fluent Java APIs**.

SimpleFX aims to make **JavaFX as simple and enjoyable as modern UI frameworks**

(React, SwiftUI, Compose) – **without FXML**, **without binding chaos**, **without magic**.

---

## ✨ Features

- 🚫 No FXML
- 🧠 Reactive State-System (`State<T>`)
- 🧱 Semantic Layouts (`card`, `center`, `border`, …)
- 🎨 Fully CSS-Styling Support
- 🧩 Fluent / DSL-Kind API
- 🖥 Desktop-App-Architecture (Header / Content / Footer)

---

## 📦 Installation (Maven)

Dependency Hosting Work in Progress.
```xml
<dependency>
  <groupId>de.dragonrex</groupId>
  <artifactId>simplefx</artifactId>
  <version>0.1.0</version>
</dependency>
```
JavaFX is automatically imported as Dependency.

```java
public class DemoApp extends App {

    @Override
    protected Parent create() {
        return UI.center(
            UI.card(
                UI.label("Hello SimpleFX"),
                UI.button("Click me").onClick(() ->
                    System.out.println("Clicked")
                )
            )
        ).get();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```

---

## 🧠 Architecture-Concepts

---
| Conzept | 	Responsibillity  |
|---------|-------------------|
| State   | Apllication State |
| FXNode  | 	UI-Elements      |
| Layouts | 	Positioning      |
| CSS     | Styling           |
| Java    | 	Logic            |

👉 Views reacting of State.

## 🔁 Reactive State (State)

Create:
```java
State<String> name = State.of("World");
```

Reactive use:
```java
UI.label(name.map(n -> "Hello " + n));
```

Two-Way-Binding:
```java
UI.textField(name);
```

---

## 🧱 Layouts

VBox / HBox
```java
UI.vbox(
    UI.label("A"),
    UI.label("B")
).spacing(12);
```

Card
```java
UI.card(
    UI.label("Settings").css("card-title"),
    UI.button("Save").primary()
);
```

Center
```java
UI.center(
    UI.label("Centered")
);
```

Border Layout (Header / Content / Footer)
```java
UI.border()
  .top(header)
  .center(content)
  .bottom(footer);
```

Sizing
```java
UI.textField(state)
  .maxWidth(280)
  .compact();
```

Helpers
```java
.fullWidth()    // Filled all free Width space
.fullHeight()   // Filled all free Height space
.grow()         // Grows to fill available space
```
---

## 🎨 Styling (CSS)

All SimpleFX-Elements support CSS-Styling. <br>
All SimpleFX-Elements have the CSS-Class `.fx`
```css
.fx {}
```

## Components have their own Classes

| Component | Class          |
|-----------|----------------|
| Label     | `.fx-label`    |
| Button    | `.fx-button`   |
| TextField | `.text-field`  |
| Card      | `.fx-card`     |
| VBox      | `.fx-vbox`     |
| HBox      | `.fx-hbox`     |

---

Label Example:
```css
.fx-label {
    -fx-text-fill: white;
}
````

Button Example:
```css
.fx-button {
    -fx-background-color: #2563eb;
    -fx-background-radius: 10;
    -fx-text-fill: white;
}

.fx-button:hover {
    -fx-background-color: #1d4ed8;
}
```

TextField Example:
```css
.text-field {
    -fx-background-color: #020617;
    -fx-border-radius: 8;
}

.text-field:focused {
    -fx-border-color: #2563eb;
}
```

## 📦 Default CSS

SimpleFX implements a **Default-Stylesheet**:
```text
/simplefx.css
```

You can override it with your own stylesheet.
```java
public static void main(String[] args) {
    SimpleFX.setCss("/dark.css");
    launch(args);
}
```
➡️ simplefx.css are not laoded.

## 🔹 Default-CSS extension (recommended)

```java
public static void main(String[] args) {
    SimpleFX.addCss("/overrides.css");
    launch(args);
}
```
➡️ simplefx.css remains intact <br>
➡️ your CSS rules selectively override defaults.

## 🔹 Loading several Stylesheets

```java
SimpleFX.setCss(
    "/css/base.css",
    "/css/components.css",
    "/css/layout.css",
    "/css/dark.css"
);
```
➡️ Order matters <br>
➡️ Later files have higher priority

## 📁 Recommended Project Structure
```text
src/main/resources/
 └─ css/
    ├─ base.css        # Colors, Fonts
    ├─ components.css  # Buttons, Inputs, Cards
    └─ layout.css      # Header, Footer, Sidebar
```

---
## 📄 Lizenz

MIT License