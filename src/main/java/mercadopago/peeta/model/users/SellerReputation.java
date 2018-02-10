/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadopago.peeta.model.users;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author gonzalo
 */
@Getter
@Setter
@Builder
public class SellerReputation {
    private Object level_id;
    private Object power_seller_status;
    private SellerReputationTransaction transactions;
    private Metric metrics;
}
