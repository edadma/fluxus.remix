/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Wechat2Fill icon from the Remix Icon library, Logos category.
 */
case class Wechat2FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Wechat2Fill icon component.
 *
 * @example Wechat2Fill <> Wechat2FillProps(size = 24, color = "blue")
 */
def Wechat2Fill = (props: Wechat2FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M5.45777 18.1847C3.359 16.677 2.00098 14.4001 2.00098 11.9078C2.00098 7.32317 6.47628 3.6001 12.001 3.6001C17.5257 3.6001 22.001 7.32317 22.001 11.9078C22.001 16.4924 17.5257 20.2155 12.001 20.2155C10.859 20.2155 9.74789 20.0616 8.72937 19.7539C8.63678 19.7232 8.51332 19.7232 8.42073 19.7232C8.23554 19.7232 8.05036 19.7847 7.89604 19.877L5.70468 21.1386C5.64295 21.1693 5.58122 21.2001 5.5195 21.2001C5.33431 21.2001 5.17999 21.0463 5.17999 20.8616C5.17999 20.7693 5.21085 20.7078 5.24172 20.6155C5.27258 20.5847 5.55036 19.5693 5.70468 18.9539C5.70468 18.8924 5.73554 18.8001 5.73554 18.7386C5.73554 18.4924 5.64295 18.3078 5.45777 18.1847ZM8.66764 10.5115C9.38493 10.5115 9.95278 9.94335 9.95278 9.22567C9.95278 8.50799 9.38493 7.93982 8.66764 7.93982C7.95036 7.93982 7.3825 8.50799 7.3825 9.22567C7.3825 9.94335 7.95036 10.5115 8.66764 10.5115ZM15.3343 10.5115C16.0516 10.5115 16.6194 9.94335 16.6194 9.22567C16.6194 8.50799 16.0516 7.93982 15.3343 7.93982C14.617 7.93982 14.0492 8.50799 14.0492 9.22567C14.0492 9.94335 14.617 10.5115 15.3343 10.5115Z")
  )
}
