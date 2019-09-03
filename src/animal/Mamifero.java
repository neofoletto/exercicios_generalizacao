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
package animal;

/**
 * @author foletto.neo
 *
 */
public class Mamifero extends Animal {

  public Mamifero() {
  }

  public Mamifero(String fala) {
    super(fala);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("AnimalMamifero [toString()=");
    builder.append(super.toString());
    builder.append("]");
    return builder.toString();
  }

}
