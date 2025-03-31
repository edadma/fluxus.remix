/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * TailwindCssLine icon from the Remix Icon library, Logos category.
 */
case class TailwindCssLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * TailwindCssLine icon component.
 *
 * @example TailwindCssLine <> TailwindCssLineProps(size = 24, color = "blue")
 */
def TailwindCssLine = (props: TailwindCssLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M8.1267 6.21913C9.17785 5.37821 10.4989 5 12.0014 5C13.41 5 14.4863 5.33092 15.3593 5.83363C16.0983 6.25922 16.7127 6.84126 17.3072 7.44492C17.953 8.10062 18.3034 8.41984 18.7437 8.52979C19.217 8.64811 19.617 8.61249 19.9825 8.45585C20.3621 8.29317 20.7745 7.96918 21.2014 7.4L22.9715 8.24254C22.6005 9.72673 21.9241 10.9425 20.8761 11.7809C19.8249 12.6218 18.5038 13 17.0014 13C15.5931 13 14.517 12.669 13.6441 12.1664C12.8103 11.6862 12.2012 11.068 11.7232 10.583C11.0611 9.9112 10.7056 9.5817 10.2591 9.47021C9.78583 9.35189 9.3858 9.38751 9.02031 9.54415C8.64071 9.70683 8.22828 10.0308 7.80139 10.6L6.03125 9.75746C6.4023 8.27328 7.07869 7.05754 8.1267 6.21913ZM12.0014 7C11.1728 7 10.5057 7.14609 9.96802 7.40781C11.2881 7.49046 12.1492 8.30299 13.0247 9.12911C13.5289 9.60492 14.0379 10.0852 14.6422 10.4332C15.2012 10.7551 15.9313 11 17.0014 11C17.8299 11 18.497 10.8539 19.0347 10.5922C17.7147 10.5095 16.8538 9.69708 15.9786 8.87101C15.4744 8.39515 14.9655 7.91478 14.3612 7.56679C13.8022 7.24491 13.0719 7 12.0014 7ZM3.1267 12.2191C4.17785 11.3782 5.49894 11 7.00139 11C8.41001 11 9.48634 11.3309 10.3593 11.8336C11.0983 12.2592 11.7127 12.8413 12.3072 13.4449C12.953 14.1006 13.3034 14.4198 13.7437 14.5298C14.217 14.6481 14.617 14.6125 14.9825 14.4559C15.3621 14.2932 15.7745 13.9692 16.2014 13.4L17.9715 14.2425C17.6005 15.7267 16.9241 16.9425 15.8761 17.7809C14.8249 18.6218 13.5038 19 12.0014 19C10.5931 19 9.51701 18.669 8.64412 18.1664C7.81033 17.6862 7.20115 17.068 6.72319 16.583C6.06109 15.9112 5.70557 15.5817 5.25911 15.4702C4.78583 15.3519 4.3858 15.3875 4.02031 15.5441C3.64071 15.7068 3.22828 16.0308 2.80139 16.6L1.03125 15.7575C1.4023 14.2733 2.07869 13.0575 3.1267 12.2191ZM7.00136 13C6.17284 13 5.50571 13.1461 4.96802 13.4078C6.28809 13.4905 7.14918 14.303 8.02466 15.1291L8.02467 15.1291C8.52891 15.6049 9.03793 16.0852 9.64217 16.4332C10.2012 16.7551 10.9313 17 12.0014 17C12.8299 17 13.497 16.8539 14.0347 16.5922C12.7147 16.5095 11.8538 15.6971 10.9786 14.871C10.4744 14.3952 9.96546 13.9148 9.36117 13.5668C8.80225 13.2449 8.0719 13 7.00136 13Z")
  )
}
