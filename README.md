# COMP-511 Java Final Study

Interactive Java study environment using Jupyter notebooks with the IJava kernel, running inside VS Code.

## Setup

**Requirements**
- Python 3.12+
- Java JDK 9+
- VS Code with the [Jupyter extension](https://marketplace.visualstudio.com/items?itemName=ms-toolsai.jupyter)

**Install dependencies**

```bash
python3 -m venv .venv
source .venv/bin/activate
pip install -r requirements.txt
```

**Install the Java kernel**

```bash
wget https://github.com/SpencerPark/IJava/releases/download/v1.3.0/ijava-1.3.0.zip
unzip ijava-1.3.0.zip -d ijava
cd ijava
python3 install.py --sys-prefix
```

## Usage

1. Activate the virtual environment:
   ```bash
   source .venv/bin/activate
   ```

2. Start the Jupyter server:
   ```bash
   jupyter notebook --no-browser
   ```

3. In VS Code, open any `.ipynb` file, click the kernel picker (top right), select **Existing Jupyter Server**, and paste the `http://127.0.0.1:8888/?token=...` URL from the terminal.

4. Select the **Java** kernel and start coding.

## Contents

| File / Folder | Description |
|---|---|
| `*.ipynb` | Java study notebooks |
| `Lecture*.pdf` | Course lecture slides |
| `MaxHeap/` | MaxHeap implementation |
| `20260422-AVL.txt` | AVL tree notes |
| `requirements.txt` | Python dependencies |