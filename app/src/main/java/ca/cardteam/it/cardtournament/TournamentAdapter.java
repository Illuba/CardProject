package ca.cardteam.it.cardtournament;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import ca.teambot.it.cave.examination.cardproject.R;

public class TournamentAdapter extends BaseAdapter {

    private List<Tournament> tournamentList;
    private LayoutInflater inflater;
    private TextView textTitle, textPrize, textRules, textDescription, textLocation;
    ImageView imageTournament;

    public TournamentAdapter(Context context, List<Tournament> tournamentList) {
        this.tournamentList = tournamentList;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return tournamentList.size();
    }

    @Override
    public Object getItem(int position) {
        return tournamentList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.tournament_item, parent, false);
        }

        Tournament tournament = tournamentList.get(position);

        imageTournament = convertView.findViewById(R.id.imageTournament);
        textTitle = convertView.findViewById(R.id.textTitle);
        textPrize = convertView.findViewById(R.id.textPrize);
        textRules = convertView.findViewById(R.id.textRules);
        textDescription = convertView.findViewById(R.id.textDescription);
        textLocation = convertView.findViewById(R.id.textLocation);

        textTitle.setText(tournament.getTitle());
        textPrize.setText(tournament.getPrize());
        textRules.setText(tournament.getRules());
        textDescription.setText(tournament.getDescription());
        textLocation.setText(tournament.getLocation());

        switch (tournament.getCardGame())
        {
            case "yugioh":
                imageTournament.setImageResource(R.drawable.yugioh);
                break;
        }

        return convertView;
    }
}
