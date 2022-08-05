/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "SIN_TITULO.java."

import java.io.*;

public class sin_titulo {

	public static void main(String args[]) {
		int n;
		int p;
		int s;
		n = 6;
		s = 0;
		p = 1;
		do {
			if (n%2==0) {
				p = p*n;
			} else {
				s = s+n;
			}
			n = n-1;
		} while (n!==0);
		System.out.println(p-s);
	}


}

