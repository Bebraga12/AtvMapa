package com.bernardo.atvmapa;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.bernardo.atvmapa.databinding.ActivityMapsBinding;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    // LatLng inicio = new LatLng(47812, 432678);
    //cria a linha --> mMap.addPolyline(new PolylineOptions().add(LatLng, LatLng));

    //marcador de endreço --> mMap.addMarker(new MarkerOptions().position(origin).title("Origem"));

    // mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(LatLng, 5));
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng inicio = new LatLng(-23.5505, -46.6333);
        LatLng fim = new LatLng(-22.9068, -43.1729);

        mMap.addMarker(new MarkerOptions().position(inicio).title("Inicio"));
        mMap.addMarker(new MarkerOptions().position(fim).title("fim"));

        mMap.addPolyline(new PolylineOptions().add(inicio, fim));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(inicio, 5));

    }
}