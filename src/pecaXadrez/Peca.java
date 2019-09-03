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
 */
public class Peca {

  private int linha = 0;
  private int coluna = 0;
  private String cor = "";
  private int movimentos = 0;

  public Peca() {
  }

  public Peca(int linha, int coluna) {
    setColuna(coluna);
    setLinha(linha);
  }

  /**
   * @return the linha
   */
  public int getLinha() {
    return linha;
  }

  /**
   * @param linha the linha to set
   */
  public void setLinha(int linha) {
    if (linha > -1)
      this.linha = linha;
  }

  /**
   * @return the coluna
   */
  public int getColuna() {
    return coluna;
  }

  /**
   * @param coluna the coluna to set
   */
  public void setColuna(int coluna) {
    if (coluna > -1)
      this.coluna = coluna;
  }

  /**
   * @return the cor
   */
  public String getCor() {
    return cor;
  }

  /**
   * @param cor the cor to set
   */
  public void setCor(String cor) {
    if (cor.length() > 0)
      this.cor = cor;
  }

  /**
   * @return the movimentos
   */
  public int getMovimentos() {
    return movimentos;
  }

  /**
   * @param movimentos the movimentos to set
   */
  public void setMovimentos(int movimentos) {
    if (movimentos > -1)
      this.movimentos += movimentos;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Peca [linha=");
    builder.append(linha);
    builder.append(", coluna=");
    builder.append(coluna);
    builder.append(", cor=");
    builder.append(cor);
    builder.append(", movimentos=");
    builder.append(movimentos);
    builder.append("]");
    return builder.toString();
  }

}
