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

/**
 *
 */
package item;

/**
 * @author foletto.neo
 *
 */
public class Item {

  private int codigo = 0;
  private String descricao = "";

  /**
   * @return the codigo
   */
  public int getCodigo() {
    return codigo;
  }

  /**
   * @param codigo the codigo to set
   */
  public void setCodigo(int codigo) {
    if (codigo > -1)
      this.codigo = codigo;
  }

  /**
   * @return the descricao
   */
  public String getDescricao() {
    return descricao;
  }

  /**
   * @param descricao the descricao to set
   */
  public void setDescricao(String descricao) {
    if (descricao.length() != 0)
      this.descricao = descricao;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Item [codigo=");
    builder.append(codigo);
    builder.append(", descricao=");
    builder.append(descricao);
    builder.append("]");
    return builder.toString();
  }
}
