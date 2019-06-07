package exemplos.aula14;

public class Hora implements Comparable<Hora>{
	private int hora;
	private int minutos;
	
	public Hora(int hora, int minutos) {
		this.hora = hora;
		this.minutos = minutos;
	}
	
	public int getHora() {
		return hora;
	}
	
	public void setHora(int hora) {
		this.hora = hora;
	}
	
	public int getMinutos() {
		return minutos;
	}
	
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	@Override
	public String toString() {
		return this.hora + ":" + (this.minutos >= 10 ? this.minutos : "0" + this.minutos);
	}

	@Override
	public int compareTo(Hora hora2) {
		int diferencaHoras = this.getHora() - hora2.getHora();
		if(diferencaHoras != 0) {
			return diferencaHoras;
		}
		
		int diferencaMinutos = this.getMinutos() - hora2.getMinutos();
		if(diferencaMinutos != 0) {
			return diferencaMinutos;
		}
		return 0;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hora;
		result = prime * result + minutos;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hora other = (Hora) obj;
		if (hora != other.hora)
			return false;
		if (minutos != other.minutos)
			return false;
		return true;
	}
}
