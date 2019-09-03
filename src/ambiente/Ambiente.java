/*
 *                     GNU GENERAL PUBLIC LICENSE
 *                        Version 3, 29 June 2007
 *
 *  Copyright (C) 2007 Free Software Foundation, Inc. <https://fsf.org/>
 *  Everyone is permitted to copy and distribute verbatim copies
 *  of this license document, but changing it is not allowed.
 *
 *                             Preamble
 *
 *   The GNU General Public License is a free, copyleft license for
 * software and other kinds of works.
 */
package ambiente;

/**
 * @author neo
 *
 */
public class Ambiente {

  private float area;

  public Ambiente() {}
  /**
   * @return the area
   */
  public float getArea() {
    return area;
  }

  /**
   * @param area the area to set
   */
  public void setArea(float area) {
    if (area > 0)
      this.area = area;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Ambiente [area=");
    builder.append(area);
    builder.append("]");
    return builder.toString();
  }
}
