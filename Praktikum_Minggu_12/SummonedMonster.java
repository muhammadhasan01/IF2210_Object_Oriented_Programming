public class SummonedMonster implements ISummoned {
    protected Monster monster;
    protected boolean isOpen;
    protected boolean isAttacking;

    public SummonedMonster(Monster monster, boolean isOpen, boolean isAttacking) {
        this.monster = monster;
        this.isOpen = isOpen;
        this.isAttacking = isAttacking;
    }

    public boolean flip() {
        if (this.isOpen) return false;
        this.isOpen = true;
        return true;
    }

    public void rotate() {
        this.isAttacking = !(this.isAttacking);
    }

    public int getPositionValue() {
        if (this.isAttacking) return this.monster.getAttackValue();
        return this.monster.getDefenseValue();
    }

    public void render() {
        System.out.print("Monster " + this.monster.getName());
        System.out.print(" dalam keadaan ");
        System.out.print((this.isOpen ? "terbuka" : "tertutup"));
        System.out.print(" dengan posisi ");
        System.out.println((this.isAttacking ? "menyerang" : "bertahan"));
    }
}