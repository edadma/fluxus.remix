# Fluxus Remix Icons

A Scala.js integration of [Remix Icon](https://remixicon.com/) for the Fluxus UI framework.

## About Remix Icon

[Remix Icon](https://remixicon.com/) is an open-source neutral-style system symbols library for designers and developers. The library includes over 3,000 high-quality icons designed for web and interface design.

All icons are free for both personal and commercial use under the [Apache License 2.0](https://github.com/Remix-Design/RemixIcon/blob/master/License).

## Usage

To use Remix Icons in your Fluxus application:

```scala
// Import the specific icons you need
import io.github.edadma.fluxus.remix.HomeIcon
import io.github.edadma.fluxus.remix.ArrowRightIcon

// Use in your components
def MyComponent = () => {
  div(
    cls := "flex items-center gap-2",
    HomeIcon <> HomeIconProps(size = 24, color = "blue"),
    "Home",
    ArrowRightIcon <> ArrowRightIconProps()
  )
}
```

The icons support the following customizations:

- `size`: The width and height of the icon in pixels (default: 24)
- `color`: The fill color of the icon (default: "currentColor", which inherits from parent)
- `className`: Additional CSS classes to apply to the SVG element

## Tree-Shaking

This library is designed to support tree-shaking in your build process. When you import specific icons, only those icons will be included in your final bundle.

## Complete Icon List

For a complete list of available icons, visit the [Remix Icon website](https://remixicon.com/).

## License and Attribution

The icons in this library are from the Remix Icon project, which is licensed under the Apache License 2.0.

### Apache License 2.0 Summary

- You can freely use, modify, distribute, and sell these icons as part of your applications
- You must include a copy of the license in your distributions
- You must retain all copyright, patent, trademark, and attribution notices

### Attribution Requirements

When using these icons:
1. Credit is not required for icons in your apps or websites, but is appreciated
2. If you distribute or modify the icons themselves, you must include attribution

## Legal Information

```
Copyright 2018-2024 Remix Design (https://remixicon.com/)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

## Integration Details

This Scala.js integration was created for the Fluxus UI framework using a code generator that:
1. Processes the original SVG files from the Remix Icon library
2. Extracts the SVG path data
3. Generates typed Scala components for each icon
4. Adds appropriate licensing information

Each icon is wrapped in a Fluxus component that renders the SVG with the standard viewBox and appropriate customizations for size, color, and class names.
