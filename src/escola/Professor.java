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
package escola;

/**
 * @author foletto.neo
 *
 */
public class Professor extends Pessoa {

  private int matricula = 0;

  /**
   * @return the matricula
   */
  public int getMatricula() {
    return matricula;
  }

  /**
   * @param matricula the matricula to set
   */
  public void setMatricula(int matricula) {
    if (matricula > -1)
      this.matricula = matricula;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Professor [matricula=");
    builder.append(matricula);
    builder.append(", toString()=");
    builder.append(super.toString());
    builder.append("]");
    return builder.toString();
  }

}
