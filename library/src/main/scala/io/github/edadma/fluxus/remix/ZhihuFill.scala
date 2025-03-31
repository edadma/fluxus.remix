/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ZhihuFill icon from the Remix Icon library, Logos category.
 */
case class ZhihuFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ZhihuFill icon component.
 *
 * @example ZhihuFill <> ZhihuFillProps(size = 24, color = "blue")
 */
def ZhihuFill = (props: ZhihuFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M13.3735 18.8965L14.8258 18.8969L15.3039 20.5335L17.9085 18.8969H20.9792V5.39468H13.3735V18.8965ZM14.9191 6.8605H19.4338V17.4311H17.7018L15.9722 18.5181L15.6573 17.4337L14.9193 17.4313V6.8607L14.9191 6.8605ZM12.0895 11.5728H8.84563C8.95376 9.89106 8.98193 8.37101 8.98193 7.01344H12.1538C12.1538 7.01344 12.2758 5.61316 11.622 5.62905H6.13529C6.35155 4.81471 6.62335 3.97414 6.94873 3.10498C6.94873 3.10498 5.45617 3.10498 4.94787 4.44368C4.73756 4.99585 4.12887 7.12109 3.04481 9.29202C3.40987 9.25229 4.61753 9.21853 5.32879 7.91359C5.45974 7.54813 5.48454 7.50046 5.64723 7.01185H7.43679C7.43679 7.66333 7.36259 11.163 7.33244 11.5702H4.09237C3.36424 11.5702 3.12755 13.036 3.12755 13.036H7.19336C6.92056 16.1307 5.45637 18.7386 2.80078 20.8003C4.07114 21.1634 5.33713 20.7427 5.96268 20.1858C5.96268 20.1858 7.38759 18.8888 8.16889 15.8876L11.5145 19.9184C11.5145 19.9184 12.0052 18.2496 11.4375 17.4365C10.9673 16.8827 9.69796 15.3847 9.15672 14.8417L8.25004 15.5621C8.52045 14.6945 8.68314 13.8519 8.7381 13.0376H12.5601C12.5601 13.0376 12.5547 11.5718 12.0895 11.5718V11.5728Z")
  )
}
