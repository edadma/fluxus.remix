/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CreativeCommonsFill icon from the Remix Icon library, Business category.
 */
case class CreativeCommonsFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CreativeCommonsFill icon component.
 *
 * @example CreativeCommonsFill <> CreativeCommonsFillProps(size = 24, color = "blue")
 */
def CreativeCommonsFill = (props: CreativeCommonsFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 2C17.5228 2 22 6.47715 22 12C22 17.5228 17.5228 22 12 22C6.47715 22 2 17.5228 2 12C2 6.47715 6.47715 2 12 2ZM9 8C6.792 8 5 9.792 5 12C5 14.208 6.792 16 9 16C10.104 16 11.104 15.552 11.828 14.828L10.4144 13.4144C10.0525 13.7762 9.5525 14 9 14C7.895 14 7 13.105 7 12C7 10.895 7.895 10 9 10C9.55299 10 10.0534 10.2241 10.4153 10.5866L11.829 9.173C11.1049 8.44841 10.1045 8 9 8ZM16 8C13.792 8 12 9.792 12 12C12 14.208 13.792 16 16 16C17.104 16 18.104 15.552 18.828 14.828L17.4144 13.4144C17.0525 13.7762 16.5525 14 16 14C14.895 14 14 13.105 14 12C14 10.895 14.895 10 16 10C16.553 10 17.0534 10.2241 17.4153 10.5866L18.829 9.173C18.1049 8.44841 17.1045 8 16 8Z")
  )
}
