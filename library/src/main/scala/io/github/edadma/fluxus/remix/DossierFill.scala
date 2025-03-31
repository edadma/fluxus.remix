/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * DossierFill icon from the Remix Icon library, Health & Medical category.
 */
case class DossierFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * DossierFill icon component.
 *
 * @example DossierFill <> DossierFillProps(size = 24, color = "blue")
 */
def DossierFill = (props: DossierFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M17 2V4H20C20.5523 4 21 4.44772 21 5V21C21 21.5523 20.5523 22 20 22H4C3.44772 22 3 21.5523 3 21V5C3 4.44772 3.44772 4 4 4H7V2H17ZM13 11H11V13H9V15H10.999L11 17H13L12.999 15H15V13H13V11ZM15 4H9V6H15V4Z")
  )
}
