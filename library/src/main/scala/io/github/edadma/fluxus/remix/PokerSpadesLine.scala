/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * PokerSpadesLine icon from the Remix Icon library, Others category.
 */
case class PokerSpadesLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * PokerSpadesLine icon component.
 *
 * @example PokerSpadesLine <> PokerSpadesLineProps(size = 24, color = "blue")
 */
def PokerSpadesLine = (props: PokerSpadesLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 15.9157C11.8821 15.467 11.6096 15.0654 11.2182 14.7894C10.6256 14.3715 9.85332 14.3071 9.19971 14.621C8.70291 14.8596 8.12567 15 7.5 15C5.38335 15 4 13.4817 4 12C4 10.9402 4.51493 9.88477 5.61339 8.70965C6.74632 7.49767 8.26768 6.39904 9.89838 5.22372C10.5914 4.72424 11.3194 4.19956 12.0001 3.65734C12.6809 4.19953 13.4088 4.72418 14.1017 5.22364C15.7324 6.39897 17.2537 7.4976 18.3866 8.70959C19.4851 9.88471 20 10.9402 20 12C20 13.4817 18.6166 15 16.5 15C15.8743 15 15.2971 14.8596 14.8003 14.621C14.1467 14.3071 13.3744 14.3715 12.7818 14.7894C12.3904 15.0654 12.1179 15.467 12 15.9157ZM12.0001 1C11.1289 1.87116 9.92046 2.74232 8.64404 3.66245C5.52486 5.91097 2 8.45193 2 12C2 14.7614 4.46243 17 7.5 17C8.42657 17 9.29962 16.7917 10.0656 16.4238C9.9739 17.2908 9.78783 18.0297 9.52965 18.7406C9.31014 19.345 9.03851 19.9291 8.72841 20.5544C8.39815 21.2204 8.87465 22 9.61803 22H14.382C15.1253 22 15.6018 21.2204 15.2716 20.5544C14.9615 19.9291 14.6899 19.345 14.4704 18.7406C14.2122 18.0297 14.0261 17.2908 13.9344 16.4238C14.7004 16.7917 15.5734 17 16.5 17C19.5376 17 22 14.7614 22 12C22 8.4519 18.4752 5.91092 15.3561 3.66238C14.0797 2.74228 12.8713 1.87114 12.0001 1ZM12 17.0738C12.1583 18.1843 12.4514 19.1212 12.8146 20H11.1854C11.5486 19.1212 11.8417 18.1843 12 17.0738Z")
  )
}
