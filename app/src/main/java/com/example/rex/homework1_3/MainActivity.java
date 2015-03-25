package com.example.rex.homework1_3;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {
    private ImageView imageView;
    private Button backBtn, nextBtn;
    private TextView teamText;
    private List<Team> teamList;
    private int position=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }

    public void findViews() {
        imageView = (ImageView) findViewById(R.id.imageView);
        teamText = (TextView) findViewById(R.id.teamText);
        backBtn = (Button) findViewById(R.id.backBtn);
        nextBtn = (Button) findViewById(R.id.nextBtn);
        teamList = new ArrayList<>();
        teamList.add(new Team(1,R.drawable.p1," 第一隊 "));
        teamList.add(new Team(2,R.drawable.p2," 第二隊 "));
        teamList.add(new Team(3,R.drawable.p3," 第三隊 "));
        teamList.add(new Team(4,R.drawable.p4," 第四隊 "));
        teamList.add(new Team(5,R.drawable.p5," 第五隊 "));
        teamList.add(new Team(6,R.drawable.p6," 第六隊 "));
        teamList.add(new Team(7,R.drawable.p7," 第七隊 "));
        teamList.add(new Team(8,R.drawable.p8," 第八隊 "));
        teamList.add(new Team(9,R.drawable.p9," 第九隊 "));
        teamList.add(new Team(10,R.drawable.p10," 第十隊 "));

        imageView.setImageResource(teamList.get(position).getLogo());
        teamText.setText(teamList.get(position).getTeamName());

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                position--;
                if (position<=0) {
                    position = teamList.size() - 1;
                    imageView.setImageResource(teamList.get(position).getLogo());
                    teamText.setText(teamList.get(position).getTeamName());
                }else{
                    imageView.setImageResource(teamList.get(position).getLogo());
                    teamText.setText(teamList.get(position).getTeamName());
                }
            }
        });
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                position++;
                if (position>=teamList.size()){
                    position=0;
                    imageView.setImageResource(teamList.get(position).getLogo());
                    teamText.setText(teamList.get(position).getTeamName());
                }else{
                    imageView.setImageResource(teamList.get(position).getLogo());
                    teamText.setText(teamList.get(position).getTeamName());
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
