# Redro Store

Redro Store is the official catalog and installable PWA for Redro applications.

## Features

- Mobile-first responsive app catalog
- Arabic and English interface
- Search and category filters
- Application detail views and links
- PWA manifest, service worker, and install icon
- Offline cache for the storefront shell
- Local catalog editing and JSON import/export

## Deployment

Deploy the repository root as a static site. No build command is required.

## Catalog management

The current admin mode is a local catalog editor. Open `/?admin=1` to edit the catalog in the current browser and export `catalog.json`. Publishing changes to the shared catalog still requires committing the exported file to this repository.

## Payment integrations

No payment collection is enabled. Payment providers must be integrated only after their official API, merchant eligibility, settlement rules, and test environment are confirmed.

## Android app updates

The Android storefront now resolves the newest APK asset from each app repository's latest GitHub Release when the user requests a download. Android still requires the user to confirm installation. Updating an installed app without uninstalling it also requires the new APK to be signed with the same signing key as the installed build; preview/debug builds created with different temporary keys cannot be upgraded in place.
