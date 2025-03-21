package com.example.myapp;

public class ClipRunner {
    public static void main(String[] args) {

        Clip[] clips = {
                new Clip(Color.RED),
                new Clip(Color.GREEN),
                new Clip(Color.BLUE),
                new Clip(Color.YELLOW),
                new Clip(Color.BLACK)
        };

        System.out.println("+++++++++++++++");

        Pushpa pushpa = new Pushpa(clips);
        pushpa.useClip(clips);

        Ticket ticket = new Ticket(TicketType.VIP, 100.0);
        Cricket cricket = new Cricket(ticket);


        Brush brush = new Brush(BrushColor.WHITE);


        Virat virat = new Virat(brush, clips, ticket, cricket);
        System.out.println("Playing");
        virat.play();

        System.out.println("Cleaning");
        virat.clean();

        System.out.println("Relaxing");
        virat.relax();
    }
}
