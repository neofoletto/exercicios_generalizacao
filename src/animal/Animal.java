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

package animal;

/**
 * @author foletto.neo
 */
public class Animal {

  private String falar = "";

  public Animal() {
  }

  protected Animal(String falar) {
    setFalar(falar);
  }

  /**
   * @return the falar
   */
  public String getFalar() {
    return falar;
  }

  /**
   * @param falar the falar to set
   */
  public void setFalar(String falar) {
    if (falar.length() != 0)
      this.falar = falar;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Animal [falar=");
    builder.append(falar);
    builder.append("]");
    return builder.toString();
  }


}
