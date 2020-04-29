class RekeningGiro extends Rekening {
	protected boolean penalti;

	public RekeningGiro(String n, double d) {
		super(n, d, 0.07);
		this.penalti = (d < 500);
	}

	public void setor(double uang) {
		uang -= 0.1;
		double tmp = this.hitungBiaya();
		this.saldo += uang - tmp;
	}

	public void tarik(double uang) {
		uang -= 0.1;
		if (this.saldo < uang) return;
		this.saldo -= uang;
		if (this.saldo < 500) this.penalti = true;
	}

	public void update() {
		double gt = this.saldo * this.sukuBunga;
		double by = this.hitungBiaya();
		double pn = (this.penalti ? 10 : 0);
		this.saldo += (gt - by - pn);
		if (this.saldo < 0) this.saldo = 0;
		if (this.saldo < 500) this.penalti = true;
	}
}