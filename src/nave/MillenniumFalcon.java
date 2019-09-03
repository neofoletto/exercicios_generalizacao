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

package nave;

/**
 * @author foletto.neo
 *
 */
public class MillenniumFalcon extends NaveEspacial {

  private float classeHiperpropulssor = 0;

  /**
   * @return the classeHiperpropulssor
   */
  public float getClasseHiperpropulssor() {
    return classeHiperpropulssor;
  }

  /**
   * @param classeHiperpropulssor the classeHiperpropulssor to set
   */
  public void setClasseHiperpropulssor(float classeHiperpropulssor) {
    if (classeHiperpropulssor > -1)
      this.classeHiperpropulssor = classeHiperpropulssor;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("MillenniumFalcon [classeHiperpropulssor=");
    builder.append(classeHiperpropulssor);
    builder.append(", toString()=");
    builder.append(super.toString());
    builder.append("]");
    return builder.toString();
  }

}
