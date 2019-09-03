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
public class Quarto extends Ambiente {

  private int capacidade = 0;

  /**
   * @return the capacidade
   */
  public int getCapacidade() {
    return capacidade;
  }

  /**
   * @param capacidade the capacidade to set
   */
  public void setCapacidade(int capacidade) {
    if (capacidade >= 0)
      this.capacidade = capacidade;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Quarto{");
    sb.append("capacidade=").append(capacidade);
    sb.append(super.toString());
    sb.append('}');
    return sb.toString();
  }
}
