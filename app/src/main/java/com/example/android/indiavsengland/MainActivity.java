package com.example.android.indiavsengland;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    //india variable
    int quantity = 0;
    //england variable
    int england = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the six button is clicked.
     */
    public void increment(View view) {
        quantity = quantity + 6;
        display(quantity);
    }

    /**
     * This method is called when the four button is clicked.
     */
    public void decrement(View view) {
        quantity = quantity + 4;
        display(quantity);
    }

    /**
     * this method is called when the double button is clicked.
     */
    public void plus(View view) {
        quantity = quantity + 2;
        display(quantity);
    }

    /**
     * this method is called when single button is clicked.
     */
    public void addOne(View view) {
        quantity = quantity + 1;
        display(quantity);
    }

    /**
     * this method is called when the england six button is clicked.
     */
    public void clickSix(View view) {
        england = england + 6;
        displayEngland(england);
    }

    /**
     * this method is called when england four button is clicked.
     */
    public void clickFour(View view) {
        england = england + 4;
        displayEngland(england);
    }

    /**
     * this method is called when england double button is clicked.
     */
    public void clickTwo(View view) {
        england = england + 2;
        displayEngland(england);
    }

    /**
     * this method is called when england single button is clicked.
     */
    public void clickOne(View view) {
        england = england + 1;
        displayEngland(england);
    }
    /**
     * this method is called when the reset button is clicked
     */
    public void submitOrder(View view) {
        displayReset(quantity * 0);
        displayReset(england * 0);

    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    /**
     * This method displays the given price on the screen.
     */
    private void displayEngland(int number) {
        TextView englandTextView = (TextView) findViewById(R.id.england_text_view);
        englandTextView.setText("" + number);
    }
    /**
     * this method is displayEngland and quantity on the screen
     */
    private void displayReset(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
        TextView englandTextView = (TextView) findViewById(R.id.england_text_view);
        englandTextView.setText("" + number);
    }
}