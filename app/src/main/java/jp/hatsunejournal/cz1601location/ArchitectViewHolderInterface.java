package jp.hatsunejournal.cz1601location;

import android.location.LocationListener;
import com.wikitude.architect.ArchitectView.ArchitectUrlListener;
import com.wikitude.architect.ArchitectView.SensorAccuracyChangeListener;

public interface ArchitectViewHolderInterface {
    public static interface ILocationProvider {
        public void onResume();
        public void onPause();
    }
}