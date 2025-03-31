/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * WeiboFill icon from the Remix Icon library, Logos category.
 */
case class WeiboFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * WeiboFill icon component.
 *
 * @example WeiboFill <> WeiboFillProps(size = 24, color = "blue")
 */
def WeiboFill = (props: WeiboFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M4.27799 8.59201C7.05085 5.8217 10.282 4.55876 11.4966 5.77587C12.0338 6.31312 12.0848 7.23996 11.741 8.34757C11.5628 8.9052 12.2655 8.5971 12.2655 8.5971C14.5062 7.66008 16.4618 7.60407 17.1747 8.62511C17.5541 9.16746 17.5184 9.93133 17.1671 10.8149C17.0041 11.2223 17.2154 11.2859 17.5261 11.3776C18.789 11.7697 20.1945 12.7144 20.1945 14.3822C20.1945 17.1448 16.2148 20.6205 10.2311 20.6205C5.66569 20.6205 1.00098 18.4078 1.00098 14.7692C1.00098 12.8671 2.20535 10.6672 4.27799 8.59201ZM16.4108 14.3338C16.174 11.9429 13.0294 10.2954 9.38829 10.657C5.74717 11.016 2.9845 13.2465 3.2213 15.6375C3.4581 18.0309 6.60271 19.6758 10.2438 19.3168C13.885 18.9552 16.6451 16.7247 16.4108 14.3338ZM6.16221 14.4382C6.91589 12.9104 8.87395 12.0473 10.6079 12.4979C12.4005 12.9614 13.3146 14.6521 12.5838 16.2969C11.8403 17.98 9.70148 18.8763 7.88856 18.2906C6.13674 17.7254 5.39579 15.9965 6.16221 14.4382ZM8.8765 15.0162C8.31378 14.7794 7.58556 15.0238 7.23672 15.5687C6.88279 16.1162 7.0483 16.7705 7.60847 17.0252C8.17628 17.2823 8.93252 17.0379 9.2839 16.4752C9.63019 15.9074 9.44686 15.2581 8.8765 15.0162ZM10.2642 14.4382C10.0478 14.3542 9.77787 14.456 9.65056 14.6699C9.52834 14.8838 9.59709 15.1282 9.81352 15.2173C10.0325 15.309 10.3151 15.2046 10.4424 14.9856C10.5647 14.7666 10.4857 14.5197 10.2642 14.4382ZM15.9576 2.92408C17.9258 2.50649 20.0545 3.12017 21.5008 4.71918C22.947 6.31822 23.3341 8.50034 22.7204 10.4228C22.5796 10.8639 22.1036 11.1075 21.6612 10.9626C21.2181 10.8174 20.9762 10.3438 21.1188 9.90078C21.5568 8.54108 21.2806 6.98652 20.2531 5.84971C19.2244 4.71154 17.712 4.27613 16.3115 4.57404C15.8558 4.67099 15.41 4.37994 15.3109 3.92475C15.2115 3.46897 15.5018 3.02078 15.9576 2.92408ZM16.584 5.84971C17.5414 5.64601 18.5802 5.94392 19.283 6.72307C19.9858 7.50222 20.1742 8.56655 19.8737 9.49847C19.7511 9.87865 19.3409 10.089 18.9596 9.96443C18.5777 9.83967 18.3714 9.43227 18.4962 9.04779C18.6464 8.59201 18.5522 8.07258 18.2085 7.69064C17.8622 7.31125 17.3555 7.16611 16.887 7.26542C16.4949 7.35199 16.1104 7.09991 16.0263 6.71034C15.9423 6.31822 16.1917 5.93316 16.584 5.84971Z")
  )
}
