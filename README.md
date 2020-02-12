# Patent Lite

<div style = "text-align:center; display:inline;">
<h4 style = "display: inline;">A decentralised platform to file a patent fast and easy<h4>
<a href="https://litehai-vtt6wd.azurewebsites.net/applications/10/workflows/10" style = "style = "display: inline;""><img src = "demo.png" style = "position:relative;left:40px;"></image></a>
</div>
  
  |  | |
| ------------- | ------------- |
|![screenshot_20190203-151326](https://user-images.githubusercontent.com/34534870/52193690-69ee7d00-2876-11e9-9272-68b0074a2b8f.jpg) | ![screenshot_20190203-151828](https://user-images.githubusercontent.com/34534870/52193693-6bb84080-2876-11e9-8893-914ce8b561ee.jpg) |
|![screenshot_20190203-151831](https://user-images.githubusercontent.com/34534870/52193695-6d820400-2876-11e9-96c0-7c5c4aa27378.jpg) |

 The complete organization of projects can be found <a href="https://github.com/dotslash-litehai">here</a>
  
  # Patent-lite-contract

This contract is deployed on Azure Blockchain Workbench.


## What is Azure Blockchain Workbench?
Azure Blockchain Workbench simplifies consortium blockchain network setup as a preconfigured solution with an Azure Resource Manager solution template. The template provides simplified deployment that deploys all components needed to run a consortium. Today, Blockchain Workbench currently supports <b> Ethereum</b>.

Azure Blockchain Workbench provides a web application and REST APIs for managing blockchain applications and users. Blockchain Workbench administrators can <b>manage application access</b> and assign your users to application roles. Azure AD users are automatically mapped to members in the application.

## Add blockchain application to Blockchain Workbench
To add a blockchain application to Blockchain Workbench, you upload the configuration and smart contract files to define the application.

- In a web browser, navigate to the Blockchain Workbench web address. For example,<code> https://{workbench URL}.azurewebsites.net/ </code>The web application is created when you deploy Blockchain Workbench.
- Sign in as a Blockchain Workbench administrator.
- Select Applications > New. The New application pane is displayed.
- Select Upload the contract configuration > Browse to locate the HelloBlockchain.json configuration file you created. The configuration file is automatically validated. Select the Show link to display validation errors. Fix validation errors before you deploy the application.
- Select Upload the contract code > Browse to locate the HelloBlockchain.sol smart contract code file. The code file is automatically validated. Select the Show link to display validation errors. Fix validation errors before you deploy the application.
- Select Deploy to create the blockchain application based on the configuration and smart contract files.
- Further add members as per the contract and it's ready to go!

## Android Application for users to keep track and utility
Azure Blockchain Workbench REST API provides developers and information workers a way to build rich integrations to blockchain applications.

Azure Blockchain Workbench REST API is used to:

- Create and manage blockchain applications and workflows within a blockchain consortium
- Manage users and organizations associated with a consortium, blockchain applications, or application workflows
- Integrate blockchain applications into their organization’s applications or third-party applications
- Create custom mobile or web apps integrated with blockchain applications
- Perform transactions on a blockchain
- Retrieve transactional and contract data from a blockchain
