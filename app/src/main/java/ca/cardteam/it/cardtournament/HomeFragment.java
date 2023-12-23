package ca.cardteam.it.cardtournament;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import ca.teambot.it.cave.examination.cardproject.R;


public class HomeFragment extends Fragment
{
    private ListView listView;
    private TournamentAdapter tournamentAdapter;
    List<Tournament> tournamentList = new ArrayList<>();

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        listView = view.findViewById(R.id.listView);
        tournamentAdapter = new TournamentAdapter(requireContext(), tournamentList);
        listView.setAdapter(tournamentAdapter);

        return view;
    }
}