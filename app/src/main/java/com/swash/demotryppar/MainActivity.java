package com.swash.demotryppar;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.swash.demotryppar.fragment.AboutUsFragment;
import com.swash.demotryppar.fragment.ApplicationFormFragment;
import com.swash.demotryppar.fragment.BlogFragment;
import com.swash.demotryppar.fragment.CertificationFragment;
import com.swash.demotryppar.fragment.FeedBackFragment;
import com.swash.demotryppar.fragment.GrievancesFragment;
import com.swash.demotryppar.fragment.KBFragment;
import com.swash.demotryppar.fragment.LiveChatFragment;
import com.swash.demotryppar.fragment.ManageProfiel;
import com.swash.demotryppar.fragment.NewsEventsFragment;
import com.swash.demotryppar.fragment.ProductDeskFragment;
import com.swash.demotryppar.fragment.WhitepaperFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    private AboutUsFragment aboutUsFragment = new AboutUsFragment();
    private ManageProfiel manageProfiel = new ManageProfiel();
    private ProductDeskFragment productDeskFragment = new ProductDeskFragment();
    private BlogFragment blogFragment = new BlogFragment();
    private WhitepaperFragment whitepaperFragment = new WhitepaperFragment();
    private ApplicationFormFragment applicationFormFragment = new ApplicationFormFragment();
    private CertificationFragment certificationFragment = new CertificationFragment();
    private FeedBackFragment feedBackFragment = new FeedBackFragment();
    private GrievancesFragment grievancesFragment = new GrievancesFragment();
    private NewsEventsFragment newsEventsFragment = new NewsEventsFragment();
    private LiveChatFragment liveChatFragment = new LiveChatFragment();
    private KBFragment kbFragment = new KBFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_aboutUs) {
            // Handle the camera action

            getFragmentManager().beginTransaction().replace(R.id.container_main,aboutUsFragment).commit();

        } else if (id == R.id.nav_manage_profile) {
            getFragmentManager().beginTransaction().replace(R.id.container_main,manageProfiel).commit();
        } else if (id == R.id.nav_productDesk) {
            getFragmentManager().beginTransaction().replace(R.id.container_main,productDeskFragment).commit();

        } else if (id == R.id.nav_blog) {

            getFragmentManager().beginTransaction().replace(R.id.container_main,blogFragment).commit();
        } else if (id == R.id.nav_white_paper) {

            getFragmentManager().beginTransaction().replace(R.id.container_main,whitepaperFragment).commit();
        } else if (id == R.id.nav_applicationForm) {
            getFragmentManager().beginTransaction().replace(R.id.container_main,applicationFormFragment).commit();
        }else if (id == R.id.nav_certification) {
            getFragmentManager().beginTransaction().replace(R.id.container_main,certificationFragment).commit();
        } else if (id == R.id.nav_feedBack) {
            getFragmentManager().beginTransaction().replace(R.id.container_main,feedBackFragment).commit();
        } else if (id == R.id.nav_grivinces) {
            getFragmentManager().beginTransaction().replace(R.id.container_main,grievancesFragment).commit();
        } else if (id == R.id.nav_news_events) {
            getFragmentManager().beginTransaction().replace(R.id.container_main,newsEventsFragment).commit();
        } else if (id == R.id.nav_liveChat) {
            getFragmentManager().beginTransaction().replace(R.id.container_main,liveChatFragment).commit();
        } else if (id == R.id.nav_kb) {
            getFragmentManager().beginTransaction().replace(R.id.container_main,kbFragment).commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
