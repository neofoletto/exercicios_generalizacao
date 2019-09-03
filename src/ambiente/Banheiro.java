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
public class Banheiro extends Ambiente {

  private boolean banheira = false;

  /**
   * @return the tv
   */
  public boolean isBanheira() {
    return banheira;
  }

  /**
   * @param banheira the tv to set
   */
  public void setBanheira(boolean banheira) {
    if (banheira)
      this.banheira = banheira;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Banheiro{");
		sb.append("banheira=").append(banheira);
		sb.append(super.toString());
		sb.append('}');
		return sb.toString();
	}
}
