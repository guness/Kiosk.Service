package com.guness.CardRegistry.core;

import com.guness.CardRegistry.ws.*;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

/**
 * Created by guness on 15/06/2017.
 */
public class WebServiceManager {
    private static WebServiceManager ourInstance = new WebServiceManager();

    public static WebServiceManager getInstance() {
        return ourInstance;
    }


    private final CardApiLocator locator = new CardApiLocator();
    private final ApiContext context = new ApiContext("565A2AF4-6542-4468-865D-675EC361435F");
    private ICardApi api;

    private WebServiceManager() {
    }

    public void init() throws ServiceException {
        api = locator.getBasicHttpBinding_ICardApi();
    }

    public CardServiceResponse retrieveCardData(String accountNumber, String bankId) throws RemoteException, IllegalAccessException {
        if (api == null) {
            throw new IllegalAccessException("Init should be called before");
        }
        RetrieveCardData retrieveCardData = new RetrieveCardData(new RetrieveCardByAccountServiceRequest(context, accountNumber, bankId));
        RetrieveCardDataResponse response = api.retrieveCardData(retrieveCardData);
        return response.getRetrieveCardDataResult();
    }

    public ValidateCardServiceResponse validateCardData(String number, String secret) throws RemoteException, IllegalAccessException {
        if (api == null) {
            throw new IllegalAccessException("Init should be called before");
        }
        ValidateCardData validateCardData = new ValidateCardData(new ValidateCardDataServiceRequest(context, number, secret));
        ValidateCardDataResponse response = api.validateCardData(validateCardData);
        return response.getValidateCardDataResult();
    }
}
