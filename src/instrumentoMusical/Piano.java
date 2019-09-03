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

package instrumentoMusical;

public class Piano extends Corda {

  private double tamanho;
  private String modelo;

  public Piano(String cor, String marca, double especura, double tamanho, String modelo) {
    super(cor, marca, especura);
    setTamanho(tamanho);
    setModelo(modelo);
  }

  public double getTamanho() {
    return tamanho;
  }

  public void setTamanho(double tamanho) {
    if (tamanho != 0)
      this.tamanho = tamanho;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    if (modelo.length() != 0)
      this.modelo = modelo;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Piano [tamanho=");
    builder.append(tamanho);
    builder.append(", modelo=");
    builder.append(modelo);
    builder.append(", toString()=");
    builder.append(super.toString());
    builder.append("]");
    return builder.toString();
  }
}
