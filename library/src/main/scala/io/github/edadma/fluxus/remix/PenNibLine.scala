/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * PenNibLine icon from the Remix Icon library, Design category.
 */
case class PenNibLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * PenNibLine icon component.
 *
 * @example PenNibLine <> PenNibLineProps(size = 24, color = "blue")
 */
def PenNibLine = (props: PenNibLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M16.5962 1.03651L22.9428 7.38312C23.1381 7.57838 23.1381 7.89496 22.9428 8.09022C22.8679 8.16513 22.7712 8.21431 22.6665 8.23067L21.1924 8.46113L15.5356 2.80428L15.7477 1.31935C15.7868 1.04599 16.04 0.856036 16.3134 0.895088C16.4205 0.910388 16.5197 0.960011 16.5962 1.03651ZM4.59487 20.1478C8.31725 16.8163 12.5899 15.82 17.2379 14.6273L17.6843 10.6099L13.3869 6.31241L9.36936 6.7588C8.17674 11.4068 7.18038 15.6795 3.84886 19.4018L2.4541 18.0071C5.28253 14.7072 6.34319 11.0539 7.7574 4.9256L14.1214 4.21849L19.7783 9.87539L19.0711 16.2393C12.9429 17.6535 9.28947 18.7142 5.98964 21.5426L4.59487 20.1478ZM9.87872 14.118C9.09767 13.3369 9.09767 12.0706 9.87872 11.2896C10.6598 10.5085 11.9261 10.5085 12.7071 11.2896C13.4882 12.0706 13.4882 13.3369 12.7071 14.118C11.9261 14.899 10.6598 14.899 9.87872 14.118Z")
  )
}
