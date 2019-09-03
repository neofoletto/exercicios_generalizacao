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
public class Aluno extends Pessoa {

  private String disciplina = "";

  /**
   * @return the disciplina
   */
  public String getDisciplina() {
    return disciplina;
  }

  /**
   * @param disciplina the disciplina to set
   */
  public void setDisciplina(String disciplina) {
    if (disciplina.length() > 2)
      this.disciplina = disciplina;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Aluno [disciplina=");
    builder.append(disciplina);
    builder.append(", toString()=");
    builder.append(super.toString());
    builder.append("]");
    return builder.toString();
  }

}
