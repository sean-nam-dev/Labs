# LittleLemonData

An educational Android project focused on **data handling and reactivity** as part of the **Meta Android Developer Professional Certificate (Coursera)**.

## Project Overview
This project is dedicated to working with **remote data sources, local persistence, and reactive data flow** in Android.

The core idea is:
- fetch data from the network using **Ktor**
- parse JSON responses
- store data locally using **Room**
- expose data reactively to the UI
- apply reactive sorting and filtering

UI complexity is intentionally minimal. The focus is on the **data layer and data flow**.

## Learning Objectives
- Making network requests with Ktor Client
- Parsing JSON using kotlinx.serialization
- Persisting data with Room
- Designing an offline-first data flow
- Exposing data as `Flow`
- Reactive sorting and filtering
- Separating network, local, and domain models

## Key Features
- GET request to a remote API using Ktor
- JSON parsing into DTO models
- Mapping DTO → domain → database entities
- Local data persistence with Room
- Reactive data observation using `Flow`
- Sorting and filtering handled reactively in ViewModel
- Clear separation of data, domain, and presentation layers

## Tech Stack
- Kotlin
- Ktor Client (Android engine)
- kotlinx.serialization
- Room
- Coroutines
- Flow
- ViewModel

## Architecture Notes
- **Network layer** handles API calls and DTO parsing
- **Local layer** (Room) acts as the single source of truth
- **Repository** coordinates network refresh and local storage
- **ViewModel** combines flows for sorting and filtering
- UI observes reactive streams without manual synchronization

## Reactive Behavior
- Database changes automatically propagate to the UI
- Sorting and filtering are implemented using `Flow` operators
- No manual refresh or state syncing in the UI layer

## Disclaimer
This repository contains **learning-focused code only**.  
It is not intended to represent a production-ready data architecture.

## Purpose
Practice and understanding of modern Android data handling:
networking, persistence, and reactive state propagation.