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

package pecaXadrez;

/**
 * @author foletto.neo
 *
 */
public class Bispo extends Peca {

  public Bispo() {
    // TODO Auto-generated constructor stub
  }

  public Bispo(int linha, int coluna) {
    // TODO Auto-generated constructor stub
    mover(linha, coluna);
  }

  public boolean mover(int linha, int coluna) {
    if (linha == coluna) {
      super.setMovimentos(1);
      return true;
    }
    return false;
  }
}
