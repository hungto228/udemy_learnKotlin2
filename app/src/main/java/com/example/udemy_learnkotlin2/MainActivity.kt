package com.example.udemy_learnkotlin2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.nav_head_layout.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    lateinit var toggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        toggle = ActionBarDrawerToggle(this, drawer, R.string.open, R.string.close)
        drawer.addDrawerListener(toggle)
        toggle.syncState()
        navigationView.setNavigationItemSelectedListener(this)
        var headView = navigationView.getHeaderView(0)

        tv_login.setOnClickListener {
            Toast.makeText(this, "clcik", Toast.LENGTH_SHORT).show()
        }
        //head
        var mAddchanner = headView.findViewById<ImageView>(R.id.image_add_channer)
        var mName = headView.findViewById<TextView>(R.id.tv_name)
        var mEmail = headView.findViewById<TextView>(R.id.tv_email)
        var mUser = headView.findViewById<ImageView>(R.id.image_user)
        var mLogin = headView.findViewById<Button>(R.id.btn_login)
        mAddchanner.setOnClickListener {
            Toast.makeText(this, "click", Toast.LENGTH_SHORT).show()
        }
        mLogin.setOnClickListener {

        }

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_chao -> Toast.makeText(this, "chao", Toast.LENGTH_SHORT).show()
            R.id.menu_chao1 -> Toast.makeText(this, "chao1", Toast.LENGTH_SHORT).show()
            R.id.menu_chao2 -> Toast.makeText(this, "chao2", Toast.LENGTH_SHORT).show()

        }
        return true
    }

    override fun onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}