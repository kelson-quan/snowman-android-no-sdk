package com.example.snowman;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class DesignActivity extends AppCompatActivity {

    private ImageView snowmanImageView;
    private RadioGroup headAccessoryGroup;
    private RadioGroup neckAccessoryGroup;
    private RadioGroup feetAccessoryGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        TBD: Pending update to UI files
//        setContentView(R.layout.activity_design);

        snowmanImageView = findViewById(R.id.snowmanImageView);
//        TBD: pending update to UI
//        headAccessoryGroup = findViewById(R.id.headAccessoryGroup);
//        neckAccessoryGroup = findViewById(R.id.neckAccessoryGroup);
//        feetAccessoryGroup = findViewById(R.id.feetAccessoryGroup);

        setAccessoryListeners(headAccessoryGroup);
        setAccessoryListeners(neckAccessoryGroup);
        setAccessoryListeners(feetAccessoryGroup);
    }

    private void setAccessoryListeners(RadioGroup accessoryGroup) {
        accessoryGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton selectedButton = findViewById(checkedId);
                int accessoryResourceId = Integer.parseInt(selectedButton.getTag().toString());
                applyAccessory(group.getId(), accessoryResourceId);
            }
        });
    }

    private void applyAccessory(int accessoryGroupId, int accessoryResourceId) {
        // Add code here to apply the accessory to the snowman image
        // based on accessory group ID and resource ID
    }
}
