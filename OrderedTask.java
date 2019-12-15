class OrderedTask extends Question{
    protected int number;
    public int getNum(){return number;}

    public OrderedTask(String Subject,Subject quest,int number){
        super(Subject,quest);
        this.number = number;
    }
}
