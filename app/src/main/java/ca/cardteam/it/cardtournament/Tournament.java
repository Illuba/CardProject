package ca.cardteam.it.cardtournament;

public class Tournament
{
    private String cardGame;
    private String title;
    private String prize;
    private String rules;
    private String description;
    private String location;
    private String tournamentTime;

    public Tournament (String cardGame, String title, String prize, String rules, String description, String location, String tournamentTime)
    {
        this.cardGame = cardGame;
        this.prize = prize;
        this.rules = rules;
        this.description = description;
        this.location = location;
        this.tournamentTime = tournamentTime;
    }

    public String getCardGame() {
        return cardGame;
    }

    public void setCardGame(String cardGame) {
        this.cardGame = cardGame;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrize() {
        return prize;
    }

    public void setPrize(String prize) {
        this.prize = prize;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTournamentTime() {
        return tournamentTime;
    }

    public void setTournamentTime(String tournamentTime) {
        this.tournamentTime = tournamentTime;
    }
}
