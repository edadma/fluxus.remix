/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * TokenSwapLine icon from the Remix Icon library, Finance category.
 */
case class TokenSwapLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * TokenSwapLine icon component.
 *
 * @example TokenSwapLine <> TokenSwapLineProps(size = 24, color = "blue")
 */
def TokenSwapLine = (props: TokenSwapLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M9 12.5 6.5 15 9 17.5 11.5 15 9 12.5ZM15 2.5C11.5724 2.5 8.76444 5.15304 8.51763 8.51763 5.15304 8.76445 2.5 11.5724 2.5 15 2.5 18.5899 5.41015 21.5 9 21.5 12.4276 21.5 15.2356 18.847 15.4824 15.4824 18.847 15.2356 21.5 12.4276 21.5 9 21.5 5.41015 18.5899 2.5 15 2.5ZM15.3234 13.4886C14.7575 11.1126 12.8874 9.24245 10.5114 8.67665 10.6772 6.34229 12.6234 4.5 15 4.5 17.4853 4.5 19.5 6.51472 19.5 9 19.5 11.3766 17.6577 13.3228 15.3234 13.4886ZM13.5 15C13.5 17.4853 11.4853 19.5 9 19.5 6.51472 19.5 4.5 17.4853 4.5 15 4.5 12.5147 6.51472 10.5 9 10.5 11.4853 10.5 13.5 12.5147 13.5 15ZM3 7C3 4.79086 4.79086 3 7 3H8.5V5H7C5.89543 5 5 5.89543 5 7V8.5H3V7ZM19 17V15.5H21V17C21 19.2091 19.2091 21 17 21H15.5V19H17C18.1046 19 19 18.1046 19 17Z")
  )
}
