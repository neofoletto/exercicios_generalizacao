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
public class Rainha extends Peca {

  public Rainha() {
  }

  public Rainha(int linha, int coluna) {
    mover(linha, coluna);
  }

  public boolean mover(int linha, int coluna) {
    super.setMovimentos(1);
    return true;
  }
}
