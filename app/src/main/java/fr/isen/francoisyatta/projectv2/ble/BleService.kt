package fr.isen.francoisyatta.projectv2.ble

import android.bluetooth.BluetoothGattCharacteristic
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup

class BleService (val name: String, val characteristics: MutableList<BluetoothGattCharacteristic>):
    ExpandableGroup<BluetoothGattCharacteristic>(name, characteristics){

}