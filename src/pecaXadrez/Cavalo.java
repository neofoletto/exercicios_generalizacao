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
public class Cavalo extends Peca {

  public Cavalo() {
  }

  public Cavalo(int linha, int coluna) {
    mover(linha, coluna);
  }

  public boolean mover(int linha, int coluna) {
    if (linha == -2 || linha == 2) {
      if (coluna == -1 || coluna == 1)
        super.setMovimentos(1);
      return true;
    } else if (coluna == -2 || coluna == 2)
      if (linha == -1 || linha == 1) {
        super.setMovimentos(1);
        return true;
      }
    return false;
  }
}
