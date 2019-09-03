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
 * @author foletto.neo
 *
 */
public class Sala extends Ambiente {

  private boolean tv = false;

  /**
   * @return the tv
   */
  public boolean isTv() {
    return tv;
  }

  /**
   * @param tv the tv to set
   */
  public void setTv(boolean tv) {
    if (tv)
      this.tv = tv;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Sala{");
    sb.append("tv=").append(tv);
    sb.append(super.toString());
    sb.append('}');
    return sb.toString();
  }
}
