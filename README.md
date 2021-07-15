# **MAIL.TM**

A Kotlin wrapper around https://mail.tm

API page: https://api.mail.tm/

### **Generate email**

`commonUtils.generateEmail()`

### **Get domain**

`API.domain.getDomains(1).hydraMember?.get(0)?.domain`

### **Create account**

`API.account.getAccount(email + domain, email).address.toString()`

### **Get token**

`API.token.getToken(account, email).token.toString()`

### **Get message id**

`API.messages.getMessages(token,1).hydraMember?.get(0)?.id`

### **Get text message**

`API.messageId.getMessage(messageId,token).text`