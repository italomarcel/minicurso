package teste.teste.gdg.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import teste.teste.gdg.R;
import teste.teste.gdg.adapters.RecyclerViewAdapter;
import teste.teste.gdg.model.ItemObject;

public class GridActivity extends AppCompatActivity {

    private GridLayoutManager lLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
        setTitle(null);

        Toolbar topToolBar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(topToolBar);


        List<ItemObject> rowListItem = getAllItemList();
        lLayout = new GridLayoutManager(GridActivity.this, 4);

        RecyclerView rView = (RecyclerView) findViewById(R.id.recycler_view);
        rView.setHasFixedSize(true);
        rView.setLayoutManager(lLayout);

        RecyclerViewAdapter rcAdapter = new RecyclerViewAdapter(GridActivity.this, rowListItem);
        rView.setAdapter(rcAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();


        return super.onOptionsItemSelected(item);
    }

    private List<ItemObject> getAllItemList() {

        List<ItemObject> allItems = new ArrayList<>();
        allItems.add(new ItemObject("United States", R.mipmap.ic_launcher));
        allItems.add(new ItemObject("Canada", R.mipmap.ic_launcher));
        allItems.add(new ItemObject("United Kingdom", R.mipmap.ic_launcher));
        allItems.add(new ItemObject("Germany", R.mipmap.ic_launcher));
        allItems.add(new ItemObject("Sweden", R.mipmap.ic_launcher));
        allItems.add(new ItemObject("United Kingdom", R.mipmap.ic_launcher));
        allItems.add(new ItemObject("Germany", R.mipmap.ic_launcher));
        allItems.add(new ItemObject("Sweden", R.mipmap.ic_launcher));


        return allItems;
    }
}
