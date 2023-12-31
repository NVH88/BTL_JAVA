/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Product;

/**
 *
 * @author DELL
 */
public class Voucher {
    private int voucher_id;
    private int discount_amount;
    private int expire_time;

    public Voucher(int voucher_id, int discount_amount, int expire_time) {
        this.voucher_id = voucher_id;
        this.discount_amount = discount_amount;
        this.expire_time = expire_time;
    }

    public int getVoucher_id() {
        return voucher_id;
    }
    public int getDiscount_amount() {
        return discount_amount;
    }
    public int getExpire_time() {
        return expire_time;
    }
    @Override
    public String toString() {
        return "Voucher{" + "voucher_id=" + voucher_id + ", discount_amount=" + discount_amount + ", expire_time=" + expire_time + '}';
    }
    
    
    
    
}
