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
public class Midia extends Item {

  private String gravadora = "";
  private float duracao = 0;

  /**
   * @return the gravadora
   */
  public String getGravadora() {
    return gravadora;
  }

  /**
   * @param gravadora the gravadora to set
   */
  public void setGravadora(String gravadora) {
    if (gravadora.length() != 0)
      this.gravadora = gravadora;
  }

  /**
   * @return the duracao
   */
  public float getDuracao() {
    return duracao;
  }

  /**
   * @param duracao the duracao to set
   */
  public void setDuracao(float duracao) {
    if (duracao > 0)
      this.duracao = duracao;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Midia [gravadora=");
    builder.append(gravadora);
    builder.append(", duracao=");
    builder.append(duracao);
    builder.append(", toString()=");
    builder.append(super.toString());
    builder.append("]");
    return builder.toString();
  }


}
