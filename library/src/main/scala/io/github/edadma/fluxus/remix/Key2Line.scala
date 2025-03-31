/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Key2Line icon from the Remix Icon library, Others category.
 */
case class Key2LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Key2Line icon component.
 *
 * @example Key2Line <> Key2LineProps(size = 24, color = "blue")
 */
def Key2Line = (props: Key2LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M10.7577 11.8281L18.6066 3.97919L20.0208 5.3934L18.6066 6.80761L21.0815 9.28249L19.6673 10.6967L17.1924 8.22183L15.7782 9.63604L17.8995 11.7574L16.4853 13.1716L14.364 11.0503L12.1719 13.2423C13.4581 15.1837 13.246 17.8251 11.5355 19.5355C9.58291 21.4882 6.41709 21.4882 4.46447 19.5355C2.51184 17.5829 2.51184 14.4171 4.46447 12.4645C6.17493 10.754 8.81633 10.5419 10.7577 11.8281ZM10.1213 18.1213C11.2929 16.9497 11.2929 15.0503 10.1213 13.8787C8.94975 12.7071 7.05025 12.7071 5.87868 13.8787C4.70711 15.0503 4.70711 16.9497 5.87868 18.1213C7.05025 19.2929 8.94975 19.2929 10.1213 18.1213Z")
  )
}
